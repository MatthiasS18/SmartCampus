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
import { IncidentPage } from '../pages/incident/incident';
import { NewIncidentPage } from '../pages/new_incident/newIncident';
import { EquipmentPage } from '../pages/equipment/equipment';

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
    IncidentPage,
    NewIncidentPage,
    EquipmentPage
  ],
  selector: 'app-root',
  // styleUrl: './app.css',
  templateUrl: './app.html',
})
export class App {
  protected readonly title = signal('smartcampus');
}
