import { Reservation } from './reservation';
import { Incident } from './incident';

export interface User {
  id: number;
  name: string;
  email: string;
  role: Role;
  reservation: Reservation[];
  incident: Incident[];
}

export type Role = 'STUDENT' | 'TEACHER' | 'TECHNICIAN' | 'ADMIN';
