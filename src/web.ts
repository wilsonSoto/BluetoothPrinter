import { WebPlugin } from '@capacitor/core';

import type { printBPlugin } from './definitions';

export class printBWeb extends WebPlugin implements printBPlugin {
  testingMessage(): boolean {
    console.log('Imprimiendo desde la web');
    return true;
  }
  getNotifications(): boolean {
    console.log('Imprimiendo desde la web');
    return true;
  }
  blPrint(options: { value: string; }): boolean {
    console.log(options)
    console.log(options.value)
    return true
  }
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
