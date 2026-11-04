import { Component, inject, OnInit } from '@angular/core';
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
export class SettingsPage implements OnInit {
  
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }

  themeService = inject(ThemeService);

  toggleTheme(): void {
    const newTheme = this.themeService.theme() === 'dark' ? 'light' : 'dark';

    this.themeService.setTheme(newTheme);
  }
}
