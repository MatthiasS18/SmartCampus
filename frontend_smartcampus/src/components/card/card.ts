import { Component, input } from '@angular/core';

@Component({
  selector: 'card-component',
  standalone: true,
  templateUrl: './card.html'
})
export class CardComponent {
    title = input.required<string>();
    value = input.required<number>();
    color = input.required<string>();
}