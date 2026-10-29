import { Component } from '@angular/core';
import { NavbarComponent } from '../navbar/navbar';
import { SidebarComponent } from '../sidebar/sidebar';
import { ButtonComponent } from '../button/button';

@Component({
  selector: 'detailRoom-page',
  standalone: true,
  templateUrl: './detailRoom.html',
  imports: [NavbarComponent, SidebarComponent, ButtonComponent],
})
export class detailRoomPage {}
