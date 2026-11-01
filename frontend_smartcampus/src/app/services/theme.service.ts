import { Injectable, signal } from '@angular/core';

export type Theme = 'light' | 'dark';

@Injectable({
  providedIn: 'root',
})
export class ThemeService {
  theme = signal<Theme>(localStorage.getItem('theme') === 'dark' ? 'dark' : 'light');

  constructor() {
    this.applyTheme();
  }

  setTheme(theme: Theme) {
    this.theme.set(theme);
    localStorage.setItem('theme', theme);
    this.applyTheme();
  }

  private applyTheme() {
    document.documentElement.classList.toggle('dark', this.theme() === 'dark');
  }
}
