import { Component, input } from '@angular/core';
import { NavbarComponent } from '../../components/navbar/navbar';
import { SidebarComponent } from '../../components/sidebar/sidebar';
import { ButtonComponent } from '../../components/button/button';
import { FormComponent } from '../../components/form/form';

@Component({
  selector: 'newIncident-page',
  standalone: true,
  templateUrl: './newIncident.html',
  imports: [NavbarComponent, SidebarComponent, ButtonComponent, FormComponent],
})
export class NewIncidentPage {
  formFields = [
    {
      label: 'Salle concernée *',
      type: 'text',
      placeholder: 'Ex : A101',
      colSpan: 2,
    },
    {
      label: 'Description *',
      type: 'textarea',
      placeholder: 'Décrivez le problème rencontré...',
      colSpan: 2,
    },
    {
      label: 'Priorité',
      type: 'select',
      placeholder: 'Choisissez une priorité',
      colSpan: 2,
    },
    {
      label: 'Photo (optionnelle)',
      type: 'file',
      placeholder: '',
      colSpan: 1,
    },
  ];
}
