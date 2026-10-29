import { Component } from '@angular/core';
import { TableComponent } from '../table/table';
import { NavbarComponent } from '../navbar/navbar';
import { SidebarComponent } from '../sidebar/sidebar';
import { searchFilterComponent } from '../searchFilter/searchFilter';
import { ButtonComponent } from '../button/button';

@Component({
  selector: 'room-page',
  standalone: true,
  templateUrl: './room.html',
    imports: [TableComponent, NavbarComponent, SidebarComponent, searchFilterComponent, ButtonComponent],
  
})
export class RoomPage {
    reservationHeaders = ['Salle', 'Horaire', 'Date', 'Statut'];
}
