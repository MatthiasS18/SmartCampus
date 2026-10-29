import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ConnexionComponent } from '../components/connexion/connexion';
import { SidebarComponent } from '../components/sidebar/sidebar';
import { NavbarComponent } from '../components/navbar/navbar';
import { DashboardPage } from '../components/dashboard/dashboard';
import { TableComponent } from '../components/table/table';
import { RoomPage } from '../components/room/room';

@Component({
  imports: [ConnexionComponent, SidebarComponent, NavbarComponent, DashboardPage, RoomPage],
  selector: 'app-root',
  // styleUrl: './app.css',
  templateUrl: './app.html',
})
export class App {
  protected readonly title = signal('smartcampus');
}
