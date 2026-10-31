import { Component, input } from '@angular/core';
import { RouterLink, RouterOutlet } from '@angular/router';

@Component({
  selector: 'notFound-page',
  standalone: true,
  templateUrl: './not-found.html',
  imports: [RouterLink, RouterOutlet],
})
export class NotFoundPage {}
