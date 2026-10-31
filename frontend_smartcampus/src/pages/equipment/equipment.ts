import { Component } from '@angular/core';
import { SidebarComponent } from '../../components/sidebar/sidebar';
import { NavbarComponent } from '../../components/navbar/navbar';
import { ButtonComponent } from '../../components/button/button';
import { TableComponent } from '../../components/table/table';

@Component({
  selector: 'equipment-page',
  standalone: true,
  templateUrl: './equipment.html',
  imports: [SidebarComponent, NavbarComponent, ButtonComponent, TableComponent],
})
export class EquipmentPage {
  equipmentHeaders = ['Date', 'Lieu', 'Description', 'Priorité', 'Statut'];
}
