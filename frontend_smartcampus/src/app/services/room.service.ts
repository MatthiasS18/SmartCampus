import { HttpClient } from '@angular/common/http';
import { inject, Injectable } from '@angular/core';
import { Room } from '../models/room';

@Injectable({
  providedIn: 'root',
})
export class RoomService {
  private http = inject(HttpClient);
  private apiUrl = 'http://localhost:8080/api/rooms';

  getRooms() {
    return this.http.get<Room[]>(this.apiUrl);
  }
}
