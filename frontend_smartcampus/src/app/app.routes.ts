import { Routes } from '@angular/router';
import { DashboardPage } from '../pages/dashboard/dashboard';
import { RoomPage } from '../pages/room/room';
import { ReservationPage } from '../pages/reservation/reservation';
import { IncidentPage } from '../pages/incident/incident';
import { EquipmentPage } from '../pages/equipment/equipment';
import { NotFoundPage } from '../pages/not-found/not-found';
import { SettingsPage } from '../pages/settings/settings';

export const routes: Routes = [
  {
    path: '',
    component: DashboardPage,
  },
  {
    path: 'room',
    component: RoomPage,
  },
  {
    path: 'reservation',
    component: ReservationPage,
  },
  {
    path: 'incident',
    component: IncidentPage,
  },
  {
    path: 'equipment',
    component: EquipmentPage,
  },
  {
    path: 'settings',
    component: SettingsPage,
  },
  {
    path: '**',
    component: NotFoundPage,
  },
];
