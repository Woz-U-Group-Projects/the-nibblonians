import { Component, OnInit } from "@angular/core";
import { FileUploader, FileSelectDirective } from 'ng2-file-upload/ng2-file-upload'
import { first } from 'rxjs/operators';
import { User } from './user';
import { UserService } from './user.service';
// import { AuthService } from '../app/auth.service';


const URL = 'http:localhost:4000/api/upload'
@Component({
  selector: "app-root",
  templateUrl: "./app.component.html",
  styleUrls: ["./app.component.css"]
})
export class AppComponent implements OnInit {
  // title = 'ng8fileupload';
  // public uploader: FileUploader = new FileUploader({ url: URL, itemAlias: 'photo' });
  // ngOnInit() {
  //   this.uploader.onAfterAddingFile = (file) => { file.withCredentials = false; };
  //   this.uploader.onCompleteItem = (item: any, response: any, status: any, headers: any) => {
  //        console.log('ImageUpload:uploaded:', item, status, response);
  //        alert('File uploaded successfully');
//     };
//   };
//  };


    currentUser: User;
    users = [];

    constructor(
        // private authService: AuthService,
        private userService: UserService
    ) {
        // this.currentUser = this.AuthService.currentUserValue;
    }

    ngOnInit() {
        this.loadAllUsers();
    }

    deleteUser(id: number) {
        this.userService.delete(id)
           this.loadAllUsers();
    }

    private loadAllUsers() {
        this.userService.getAll()
    this.users = this.users;
    }
}