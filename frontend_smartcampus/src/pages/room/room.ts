import { Component } from '@angular/core';
import { TableComponent } from '../../components/table/table';
import { NavbarComponent } from '../../components/navbar/navbar';
import { SidebarComponent } from '../../components/sidebar/sidebar';
import { searchFilterComponent } from '../../components/searchFilter/searchFilter';
import { ButtonComponent } from '../../components/button/button';

@Component({
  selector: 'room-page',
  standalone: true,
  templateUrl: './room.html',
    imports: [TableComponent, NavbarComponent, SidebarComponent, searchFilterComponent, ButtonComponent],
  
})
export class RoomPage {
    reservationHeaders = ['Salle', 'Horaire', 'Date', 'Statut', 'Actions'];
}
