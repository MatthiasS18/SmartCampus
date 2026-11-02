import { Component, inject } from '@angular/core';
import { ThemeService } from '../../app/services/theme.service';
import { SidebarComponent } from '../../components/sidebar/sidebar';
import { NavbarComponent } from '../../components/navbar/navbar';
import { NgClass } from '@angular/common';

@Component({
  selector: 'app-settings',
  standalone: true,
  imports: [SidebarComponent, NavbarComponent, NgClass],
  templateUrl: './settings.html',
})
export class SettingsPage {
  themeService = inject(ThemeService);

  toggleTheme(): void {
    const newTheme = this.themeService.theme() === 'dark' ? 'light' : 'dark';

    this.themeService.setTheme(newTheme);
  }
}
