import { Component, inject, OnInit, signal } from '@angular/core';
import { TableComponent } from '../../components/table/table';
import { NavbarComponent } from '../../components/navbar/navbar';
import { SidebarComponent } from '../../components/sidebar/sidebar';
import { searchFilterComponent } from '../../components/searchFilter/searchFilter';
import { ButtonComponent } from '../../components/button/button';
import { RoomService } from '../../app/services/room.service';
import { Room } from '../../app/models/room';

@Component({
  selector: 'room-page',
  standalone: true,
  templateUrl: './room.html',
  imports: [
    TableComponent,
    NavbarComponent,
    SidebarComponent,
    searchFilterComponent,
    ButtonComponent,
  ],
})
export class RoomPage implements OnInit {
  private roomService = inject(RoomService);

  roomHeaders = ['Salle', 'Bâtiment', 'Étage', 'Capacité', 'Actions'];
  roomsData = signal<Room[]>([]);

  ngOnInit(): void {
    this.roomService.getRooms().subscribe({
      next: (rooms) => {
        this.roomsData.set(rooms);
      },
      error: (error) => {
        console.error('Erreur :', error);
      },
    });
  }
}
