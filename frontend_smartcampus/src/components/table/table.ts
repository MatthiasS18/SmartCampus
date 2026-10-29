import { Component, input } from '@angular/core';

@Component({
  selector: 'table-component',
  standalone: true,
  templateUrl: './table.html'
})
export class TableComponent {
  title = input<string>();
  headers = input.required<string[]>();
}