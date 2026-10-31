import { Component, input } from '@angular/core';

interface FormField {
  label: string;
  type: string;
  placeholder?: string;
  colSpan?: number;
}

@Component({
  selector: 'form-component',
  standalone: true,
  templateUrl: './form.html',
})
export class FormComponent {
  title = input<string>();
  fields = input<FormField[]>([]);
}
