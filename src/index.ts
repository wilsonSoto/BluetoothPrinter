import { registerPlugin } from '@capacitor/core';

import type { printBPlugin } from './definitions';

const printB = registerPlugin<printBPlugin>('printB', {
  web: () => import('./web').then(m => new m.printBWeb()),
});

export * from './definitions';
export { printB };
