import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
 
@Injectable({providedIn: 'root'})
export class UserService {
 
  private usersUrl: string;
 
  constructor(private http: HttpClient) {
    this.usersUrl = 'http://localhost:8080/users';
  }
 
  // public findAll(): Observable<User[]> {
  //   return this.http.get<User[]>(this.usersUrl);
  // }
 
 getAll(): Observable<any>{
    return this.http.get(this.usersUrl);
  }
}