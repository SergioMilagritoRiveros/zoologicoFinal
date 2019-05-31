
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class ShowService {

  constructor(private http: HttpClient) {

  }
  show = '/Zoologico/api/Show';

  async getshow() {
    try {
      let response = await this.http
        .get(this.show)
        .toPromise();
      return response;
    } catch (error) {
      await error;
    }
  }
  getShowsid(id: number) {
    return this.http.get(this.show + '/' + id);
  }
  deleteShow(id: number) {

    return this.http.delete(this.show + '/' + id);
  }
  postShow(id: number, show: string) {
    return this.http.post(this.show, { show:show, id:id });
  }
  putShow(id: number, show: string) {
    return this.http.put(this.show + '/' + id, { show, id });
  }
}
