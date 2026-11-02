import { Component, input } from '@angular/core';
import { Room } from '../../app/models/room';

@Component({
  selector: 'table-component',
  standalone: true,
  templateUrl: './table.html',
})
export class TableComponent {
  title = input<string>();
  headers = input.required<string[]>();
  datas = input<Room[]>([]);

  getRoomValues(room: Room): (string | number)[] {
    return Object.values(room);
  }
}
