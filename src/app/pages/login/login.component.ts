import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { LoginService } from 'src/app/services/login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  loginData={
    username:'',
    password:''
  }

  constructor(private snack:MatSnackBar, private login:LoginService)
  {

  }
  ngOnInit(): void {
    
  }
  formSubmit()
  {
    console.log("login form submission");
    if(this.loginData.username.trim()=='' || this.loginData.username==null)
    {
        this.snack.open("user name is required",'',
        {
          duration: 3000,
        });
        return;
    }
     if(this.loginData.password.trim()=='' || this.loginData.password==null)
    {
        this.snack.open("user password is required",'',
        {
          duration: 3000,
        });
        return;
    }

    //request to serevr to gernate token 
      this.login.generateToken(this.loginData).subscribe(
        (data:any)=>{
          console.log("success");
          console.log(data);  
          //login user 
          this.login.loginUser(data.token);
          this.login.getCurrentUser().subscribe(
          (user:any)=>{
            this.login.setUser(user);
            console.log(user);
            //redirect user dashbord

          }
          );
        },
        (error)=>{
          console.log("error....");
          console.log(error);
        }
      );
  }

}