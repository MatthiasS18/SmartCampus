import { NgClass } from '@angular/common';
import { Component, input } from '@angular/core';

@Component({
  selector: 'button-component',
  standalone: true,
  templateUrl: './button.html',
  imports: [NgClass],
})
export class ButtonComponent {
  title = input.required<string>();
  colorBackground = input<string>('bg-blue-600 hover:bg-blue-700');
  colorText = input<string>('text-white');
}
