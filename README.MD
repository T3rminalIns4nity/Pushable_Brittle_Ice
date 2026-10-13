# Pushable Brittle Ice

***

This mod couldn't get much more simple; all it does is mix in to one class to override the `pushReaction()` of the Brittle Ice block.

```java
@Mixin(BlockBehaviour.BlockStateBase.class)
public class BrittleIceMixin {

    @Inject(
            method = "getPistonPushReaction",
            at = @At("HEAD"),
            cancellable = true
    )
    private void overridePushReaction(CallbackInfoReturnable<PushReaction> cir) {
        BlockBehaviour.BlockStateBase state = (BlockBehaviour.BlockStateBase) (Object) this;

        if (state.getBlock() instanceof BrittleIceBlock) {
            cir.setReturnValue(PushReaction.PUSH_PULL);
        }
    }
}
```

Feel free to do with this mod whatever you like; put it on your server, put it in your modpack, or ~~hang it up on your wall!~~ Just be sure not to claim it as solely your own work, and leave a paper trail back to [me](https://modrinth.com/user/T3rminalIns4nity) if you redistribute/port it somewhere.

***

Note: it should go without saying that this mod absolutely won't work on any version before 26.4-snapshot-4, as Brittle Ice *literally* didn't exist before then :)