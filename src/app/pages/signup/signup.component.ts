import { Component } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { UserService } from 'src/app/services/user.service';
import Swal from 'sweetalert2'

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent {
  constructor(private userService:UserService,private snack:MatSnackBar){}

  public user={
    username:'',
    password:'',
    firstName:'',
    lastName:'',
    email:'',
    mobileNumber:''
  }
  formSubmit()
  {
    console.log(this.user);
    if(this.user.username=='' || this.user.username==null) {
          this.snack.open("User name is required !!",'',{
            duration:3000,
            // verticalPosition: 'top',
            // horizontalPosition:'right',
          });
         return;
    }
    //validate 
    //
      this.userService.adduser(this.user).subscribe(
        (data)=>{
          console.log(data);
          // this.snack.open("sucesss !!");
          Swal.fire('Success','user added succesfully','success');
        },
        (error)=>{
            console.log(error);
            this.snack.open("someting wesnt wrong !!",'',{
            duration:3000,
            // verticalPosition: 'top',
            // horizontalPosition:'right',
          });
        }
      );
  }

}
