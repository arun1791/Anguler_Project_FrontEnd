import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import baseUrl from './helper';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor( private http:HttpClient) { }
  //grnate token

  public generateToken(loginData:any)
  {
    return this.http.post(`${baseUrl}/auth/login`,loginData);
  }
   //get current uer 
  public getCurrentUser()
  {
    return this.http.get(`${baseUrl}/auth/current-user`)
  }

  //login user : set token localstorage
  public loginUser(token: string)
  {
    localStorage.setItem('token', token);
    return true;
  }

  //is login successful:usr is login or not 
  public isLoggedIn()
  {
    let tokenStr=localStorage.getItem('token')
    if(tokenStr==undefined || tokenStr==null || tokenStr=='')
    {
        return false;
    }else{
      return true;
    }

  }

  //logout: remove token from local stoagge 
  public logout()
  {
    localStorage.removeItem('token');
    localStorage.removeItem('user');
    return true;
  }

//get token 
  public getToken()
  {
    return localStorage.getItem('token');
  }

  //set user detaisl
  public setUser(user: any)
  {
    localStorage.setItem('user', JSON.stringify(user));
  }
  //get user
  public getUser()
  {
    let userStr=localStorage.getItem('user');
    if(userStr!=null)
    {
      return JSON.parse(userStr);
    }
    else{
      this.logout();
      return null;
    }
  }

  //get role 
  public getUserRole()
  {
    let user=this.getUser()
    return user.authorities[0].authority;
  }
  //
}
