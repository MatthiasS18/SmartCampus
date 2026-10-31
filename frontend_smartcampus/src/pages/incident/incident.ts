import { Component } from '@angular/core';
import { SidebarComponent } from '../../components/sidebar/sidebar';
import { NavbarComponent } from '../../components/navbar/navbar';
import { ButtonComponent } from '../../components/button/button';
import { TableComponent } from '../../components/table/table';

@Component({
  selector: 'incident-page',
  standalone: true,
  templateUrl: './incident.html',
  imports: [SidebarComponent, NavbarComponent, ButtonComponent, TableComponent],
})
export class IncidentPage {
  incidentHeaders = ['Date', 'Lieu', 'Description', 'Priorité', 'Statut'];
}
