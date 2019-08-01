import { Component, OnInit } from "@angular/core";


@Component({
  selector: "app-profile",
  templateUrl: "./profile.component.html",
  styleUrls: ["./profile.component.css"]
})
export class ProfileComponent implements OnInit {
  
  constructor()  {}

  ngOnInit() {
    // // find the profile for the current user based on their token
    // this.userService.getProfile().subscribe(user => (this.user = user));
  }
}
