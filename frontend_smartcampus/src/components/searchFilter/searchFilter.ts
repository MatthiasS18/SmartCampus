import { Component } from '@angular/core';

@Component({
  selector: 'searchFilter-component',
  standalone: true,
  templateUrl: './searchFilter.html',
})
export class searchFilterComponent {
  isDropdownOpen = false;

  categories = ['Salles', 'Réservations', 'Équipements'];

  selectedCategory = 'Salles';

  selectCategory(category: string) {
    this.selectedCategory = category;
    this.isDropdownOpen = false;
  }
}
