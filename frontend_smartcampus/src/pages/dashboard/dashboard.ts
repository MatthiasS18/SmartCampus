import { Component } from '@angular/core';
import { CardComponent } from '../../components/card/card';
import { TableComponent } from '../../components/table/table';
import { NavbarComponent } from '../../components/navbar/navbar';
import { SidebarComponent } from '../../components/sidebar/sidebar';

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
