import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from './user'
import { Observable } from 'rxjs';
 
@Injectable({providedIn: 'root'})
export class UserService {
    delete(id: number) {
        throw new Error("Method not implemented.");
    }
    getAll() {
        throw new Error("Method not implemented.");
    }
 
  private usersurl: string;
 
  constructor(private http: HttpClient) {
    this.usersurl = 'http://localhost:8080/api/users';
  }
 
  getUser(id: number): Observable<any> {
    return this.http.get(`${this.usersurl}/${id}`);
  }
 
  createUser(User: any): Observable<any> {
    return this.http.post(this.usersurl, User);
  }
 
  updateUser(id: number, value: any): Observable<any> {
    return this.http.put(`${this.usersurl}/${id}`, value);
  }
 
  deleteUser(id: number): Observable<any> {
    return this.http.delete(`${this.usersurl}/${id}`);
  }
 
  getUsersList(): Observable<any> {
    return this.http.get(this.usersurl);
  }
 
  getUsersByAge(age: number): Observable<any> {
    return this.http.get(`${this.usersurl}/age/${age}`);
  }
 
  deleteAll(): Observable<any> {
    return this.http.delete(this.usersurl);
  }
}