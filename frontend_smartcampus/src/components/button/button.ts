import { Component, input } from '@angular/core';

@Component({
  selector: 'button-component',
  standalone: true,
  templateUrl: './button.html',
})
export class ButtonComponent {
  title = input.required<string>();
}
