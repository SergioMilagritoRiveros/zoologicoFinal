import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  user: number;

  constructor() { }

  setuser(userr: number){
    this.user = userr;
  }

  getuser(){
    return this.user;
  }
}
