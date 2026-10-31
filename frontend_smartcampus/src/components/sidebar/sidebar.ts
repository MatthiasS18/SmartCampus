import { Component } from '@angular/core';
import { RouterLink, RouterLinkActive, RouterOutlet } from '@angular/router';
@Component({
  selector: 'sidebar-component',
  standalone: true,
  templateUrl: './sidebar.html',
  imports: [RouterLink, RouterOutlet, RouterLinkActive]
})
export class SidebarComponent {}