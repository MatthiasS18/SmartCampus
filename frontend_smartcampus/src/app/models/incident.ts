import { Room } from './room';
import { User } from './user';

export interface Incident {
  id: number;
  title: string;
  description: string;
  priority: Priority;
  status: IncidentStatus;
  room: Room;
  user: User;
}

export type Priority = 'LOW' | 'MEDIUM' | 'HIGH';

export type IncidentStatus = 'OPEN' | 'IN_PROGRESS' | 'RESOLVED';
