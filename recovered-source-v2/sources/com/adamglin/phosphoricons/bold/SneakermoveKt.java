package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Sneakermove.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SneakerMove", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getSneakerMove", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_sneakerMove", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SneakermoveKt {
    private static ImageVector _sneakerMove;

    public static final ImageVector getSneakerMove(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _sneakerMove;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("SneakerMove", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(232.94f, 163.06f);
        pathBuilder.lineToRelative(-28.62f, -14.31f);
        pathBuilder.arcTo(43.78f, 43.78f, 0.0f, false, true, 180.0f, 109.39f);
        pathBuilder.lineTo(180.0f, 80.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f);
        pathBuilder.arcToRelative(44.05f, 44.05f, 0.0f, false, true, -44.0f, -44.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -19.25f, -9.56f);
        pathBuilder.lineToRelative(-77.0f, 58.41f);
        pathBuilder.lineToRelative(-0.3f, 0.23f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -1.56f, 29.69f);
        pathBuilder.lineTo(139.57f, 216.49f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.49f, 3.51f);
        pathBuilder.lineTo(224.0f, 220.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f);
        pathBuilder.lineTo(244.0f, 180.94f);
        pathBuilder.arcTo(19.88f, 19.88f, 0.0f, false, false, 232.94f, 163.06f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 196.0f);
        pathBuilder.lineTo(153.0f, 196.0f);
        pathBuilder.lineTo(46.08f, 89.05f);
        pathBuilder.lineToRelative(12.86f, -9.76f);
        pathBuilder.lineToRelative(41.2f, 41.2f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, -17.0f);
        pathBuilder.lineTo(78.25f, 64.65f);
        pathBuilder.lineToRelative(25.24f, -19.14f);
        pathBuilder.arcTo(68.24f, 68.24f, 0.0f, false, false, 156.0f, 90.94f);
        pathBuilder.verticalLineToRelative(18.45f);
        pathBuilder.arcToRelative(67.62f, 67.62f, 0.0f, false, false, 37.59f, 60.82f);
        pathBuilder.lineTo(220.0f, 183.42f);
        pathBuilder.close();
        pathBuilder.moveTo(55.49f, 184.0f);
        pathBuilder.lineTo(32.0f, 184.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f);
        pathBuilder.lineTo(55.49f, 160.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(103.49f, 208.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f);
        pathBuilder.lineTo(48.0f, 220.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f);
        pathBuilder.lineTo(91.49f, 196.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 103.49f, 208.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _sneakerMove = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
