import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  user: number = 0;

  constructor() { }

  setuser(userr: number){
    this.user = userr;
  }

  getuser(){
    return this.user;
  }
}
