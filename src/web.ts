import { WebPlugin } from '@capacitor/core';

import type { PrintVPlugin } from './definitions';

export class PrintVWeb extends WebPlugin implements PrintVPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
