import { Component, inject } from '@angular/core';
import { Theme, ThemeService } from '../../app/services/theme.service';
import { SidebarComponent } from '../../components/sidebar/sidebar';
import { NavbarComponent } from '../../components/navbar/navbar';

@Component({
  selector: 'app-settings',
  standalone: true,
  imports: [SidebarComponent, NavbarComponent],
  templateUrl: './settings.html',
})
export class SettingsPage {
  themeService = inject(ThemeService);

  changeTheme(event: Event) {
    const theme = (event.target as HTMLSelectElement).value as Theme;
    this.themeService.setTheme(theme);
  }
}
