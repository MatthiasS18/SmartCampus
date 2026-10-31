import { Component, input } from '@angular/core';
import { NavbarComponent } from '../../components/navbar/navbar';
import { SidebarComponent } from '../../components/sidebar/sidebar';
import { ButtonComponent } from '../../components/button/button';
import { FormComponent } from '../../components/form/form';

@Component({
  selector: 'newReservation-page',
  standalone: true,
  templateUrl: './newReservation.html',
  imports: [NavbarComponent, SidebarComponent, ButtonComponent, FormComponent],
})
export class NewReservationPage {
  formFields = [
    {
      label: 'Salle *',
      type: 'text',
      placeholder: 'Ex : A101',
      colSpan: 2,
    },
    {
      label: 'Date *',
      type: 'date',
      colSpan: 2,
    },
    {
      label: 'Motif (optionnel)',
      type: 'text',
      placeholder: 'Ex : Réunion pédagogique',
      colSpan: 2,
    },
    {
      label: 'Heure de début *',
      type: 'time',
      colSpan: 1,
    },
    {
      label: 'Heure de fin *',
      type: 'time',
      colSpan: 1,
    },
  ];
}
