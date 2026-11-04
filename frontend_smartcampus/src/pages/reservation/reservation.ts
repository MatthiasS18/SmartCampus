import { Component, inject, OnInit, signal } from '@angular/core';
import { SidebarComponent } from '../../components/sidebar/sidebar';
import { NavbarComponent } from '../../components/navbar/navbar';
import { ButtonComponent } from '../../components/button/button';
import { TableComponent } from '../../components/table/table';
import { ReservationService } from '../../app/services/reservation.service';
import { Reservation } from '../../app/models/reservation';

@Component({
  selector: 'reservation-page',
  standalone: true,
  templateUrl: './reservation.html',
  imports: [SidebarComponent, NavbarComponent, ButtonComponent, TableComponent],
})
export class ReservationPage implements OnInit {
  private reservationService = inject(ReservationService);
  reservationsData = signal<Reservation[]>([]);
  reservationHeaders = ['Date', 'Horaire', 'Salle', 'Demandeur', 'Statut', 'Actions'];

  ngOnInit(): void {
    this.reservationService.getReservations().subscribe({
      next: (reservations) => {
        this.reservationsData.set(reservations);
      },
      error: (error) => {
        console.error('Error :', error);
      },
    });
  }
}
