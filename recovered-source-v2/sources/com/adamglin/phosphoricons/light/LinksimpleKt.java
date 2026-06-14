package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Linksimple.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"LinkSimple", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getLinkSimple", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_linkSimple", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LinksimpleKt {
    private static ImageVector _linkSimple;

    public static final ImageVector getLinkSimple(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _linkSimple;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("LinkSimple", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(164.25f, 91.75f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 8.49f);
        pathBuilder.lineToRelative(-64.0f, 64.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.49f, -8.48f);
        pathBuilder.lineToRelative(64.0f, -64.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 164.25f, 91.75f);
        pathBuilder.close();
        pathBuilder.moveTo(214.2f, 41.8f);
        pathBuilder.arcToRelative(54.07f, 54.07f, 0.0f, false, false, -76.38f, 0.0f);
        pathBuilder.lineTo(107.75f, 71.85f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.49f, 8.49f);
        pathBuilder.lineToRelative(30.07f, -30.06f);
        pathBuilder.arcToRelative(42.0f, 42.0f, 0.0f, false, true, 59.41f, 59.41f);
        pathBuilder.lineToRelative(-30.08f, 30.07f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.49f, 8.49f);
        pathBuilder.lineToRelative(30.07f, -30.07f);
        pathBuilder.arcTo(54.0f, 54.0f, 0.0f, false, false, 214.2f, 41.8f);
        pathBuilder.close();
        pathBuilder.moveTo(139.76f, 175.64f);
        pathBuilder.lineToRelative(-30.07f, 30.08f);
        pathBuilder.arcToRelative(42.0f, 42.0f, 0.0f, false, true, -59.41f, -59.41f);
        pathBuilder.lineToRelative(30.06f, -30.07f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.49f, -8.49f);
        pathBuilder.lineToRelative(-30.0f, 30.07f);
        pathBuilder.arcToRelative(54.0f, 54.0f, 0.0f, false, false, 76.38f, 76.39f);
        pathBuilder.lineToRelative(30.07f, -30.08f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.49f, -8.49f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _linkSimple = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
