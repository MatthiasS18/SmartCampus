import { Room } from './room';
import { User } from './user';

export interface Reservation {
  id: number;
  startDateTime: string;
  endDateTime: string;
  status: ReservationStatus;
  user: User;
  room: Room;
}

export type ReservationStatus = 'CONFIRMED' | 'CANCELLED';
