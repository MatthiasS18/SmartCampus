import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';

@Component({
  imports: [RouterOutlet],
  selector: 'app-root',
  // styleUrl: './app.css',
  template: 'salut',
})
export class App {
  protected readonly title = signal('smartcampus');
}
