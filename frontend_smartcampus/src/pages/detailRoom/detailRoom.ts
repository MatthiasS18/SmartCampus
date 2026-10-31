import { Component } from '@angular/core';
import { NavbarComponent } from '../../components/navbar/navbar';
import { SidebarComponent } from '../../components/sidebar/sidebar';
import { ButtonComponent } from '../../components/button/button';

@Component({
  selector: 'detailRoom-page',
  standalone: true,
  templateUrl: './detailRoom.html',
  imports: [NavbarComponent, SidebarComponent, ButtonComponent],
})
export class DetailRoomPage {}
