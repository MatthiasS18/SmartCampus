import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ConnexionComponent } from '../components/connexion/connexion';
import { SidebarComponent } from '../components/sidebar/sidebar';
import { NavbarComponent } from '../components/navbar/navbar';

@Component({
  imports: [ConnexionComponent, SidebarComponent, NavbarComponent],
  selector: 'app-root',
  // styleUrl: './app.css',
  templateUrl: './app.html',
})
export class App {
  protected readonly title = signal('smartcampus');
}
