import { Component } from '@angular/core';
import { SidebarComponent } from '../../components/sidebar/sidebar';
import { NavbarComponent } from '../../components/navbar/navbar';
import { ButtonComponent } from '../../components/button/button';
import { TableComponent } from '../../components/table/table';

@Component({
  selector: 'reservation-page',
  standalone: true,
  templateUrl: './reservation.html',
  imports: [SidebarComponent, NavbarComponent, ButtonComponent, TableComponent],
})
export class ReservationPage {
  reservationHeaders = ['Date', 'Horaire', 'Salle', 'Demandeur', 'Statut', 'Actions'];
}
