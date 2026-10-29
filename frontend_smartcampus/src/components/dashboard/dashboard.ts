import { Component } from '@angular/core';
import { CardComponent } from '../card/card';
import { TableComponent } from '../table/table';
import { NavbarComponent } from '../navbar/navbar';
import { SidebarComponent } from '../sidebar/sidebar';

@Component({
  selector: 'dashboard-page',
  standalone: true,
  templateUrl: './dashboard.html',
  imports: [CardComponent, TableComponent, NavbarComponent, SidebarComponent],
})
export class DashboardPage {
  reservationHeaders = ['Salle', 'Horaire', 'Date', 'Statut'];
  incidentsHeaders = ['Description', 'Salle', 'Priorité'];
}
