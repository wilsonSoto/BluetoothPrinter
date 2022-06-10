# printv

Printer Blueetooth

## Install

```bash
npm install printv
npx cap sync
```

## API

<docgen-index>

* [`echo(...)`](#echo)
* [`blPrint(...)`](#blprint)
* [`testingMessage()`](#testingmessage)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### echo(...)

```typescript
echo(options: { value: string; }) => Promise<{ value: string; }>
```

| Param         | Type                            |
| ------------- | ------------------------------- |
| **`options`** | <code>{ value: string; }</code> |

**Returns:** <code>Promise&lt;{ value: string; }&gt;</code>

--------------------


### blPrint(...)

```typescript
blPrint(options: { value: string; }) => boolean
```

| Param         | Type                            |
| ------------- | ------------------------------- |
| **`options`** | <code>{ value: string; }</code> |

**Returns:** <code>boolean</code>

--------------------


### testingMessage()

```typescript
testingMessage() => boolean
```

**Returns:** <code>boolean</code>

--------------------

</docgen-api>
