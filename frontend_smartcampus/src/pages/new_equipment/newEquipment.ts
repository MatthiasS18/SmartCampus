import { Component, input } from '@angular/core';
import { NavbarComponent } from '../../components/navbar/navbar';
import { SidebarComponent } from '../../components/sidebar/sidebar';
import { ButtonComponent } from '../../components/button/button';
import { FormComponent } from '../../components/form/form';

@Component({
  selector: 'newEquipment-page',
  standalone: true,
  templateUrl: './newEquipment.html',
  imports: [NavbarComponent, SidebarComponent, ButtonComponent, FormComponent],
})
export class NewEquipmentPage {
  formFields = [
    {
      label: 'Nom de l’équipement *',
      type: 'text',
      placeholder: 'Ex : Vidéoprojecteur',
      colSpan: 2,
    },
    {
      label: 'Type d’équipement *',
      type: 'select',
      placeholder: 'Choisissez un type',
      colSpan: 2,
    },
    {
      label: 'Salle associée *',
      type: 'text',
      placeholder: 'Ex : A101',
      colSpan: 2,
    },
  ];
}
