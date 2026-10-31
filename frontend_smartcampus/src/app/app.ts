import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ConnexionPage } from '../pages/connexion/connexion';
import { SidebarComponent } from '../components/sidebar/sidebar';
import { NavbarComponent } from '../components/navbar/navbar';
import { DashboardPage } from '../pages/dashboard/dashboard';
import { RoomPage } from '../pages/room/room';
import { DetailRoomPage } from '../pages/detailRoom/detailRoom';
import { ReservationPage } from '../pages/reservation/reservation';
import { NewReservationPage } from '../pages/new_reservation/newReservation';

@Component({
  imports: [
    ConnexionPage,
    SidebarComponent,
    NavbarComponent,
    DashboardPage,
    RoomPage,
    DetailRoomPage,
    ReservationPage,
    NewReservationPage,
  ],
  selector: 'app-root',
  // styleUrl: './app.css',
  templateUrl: './app.html',
})
export class App {
  protected readonly title = signal('smartcampus');
}
