import { Component } from '@angular/core';
import { SidebarComponent } from '../sidebar/sidebar';
import { NavbarComponent } from '../navbar/navbar';
import { ButtonComponent } from '../button/button';
import { TableComponent } from '../table/table';

@Component({
  selector: 'reservation-page',
  standalone: true,
  templateUrl: './reservation.html',
  imports: [SidebarComponent, NavbarComponent, ButtonComponent, TableComponent],
})
export class ReservationPage {
  reservationHeaders = ['Date', 'Horaire', 'Salle', 'Demandeur', 'Statut', 'Actions'];
}
